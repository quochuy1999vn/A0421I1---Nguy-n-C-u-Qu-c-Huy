package upload_songs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import upload_songs.model.Song;
import upload_songs.model.SongForm;
import upload_songs.service.ISongService;
import upload_songs.service.SongService;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/song")
@PropertySource("classpath:upload_song.properties")
public class SongController {
    private ISongService songService = new SongService();

    @Value("${file-upload}")
        private String fileUpload;

    @GetMapping("")
    public String index(Model model) {
        List<Song> songList = new ArrayList<>();
        model.addAttribute("songList", songList);
        return "/index";
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("songForm", new SongForm());
        return modelAndView;
    }

    @PostMapping("/save")
    public ModelAndView saveSong (@ModelAttribute SongForm songForm) {
        MultipartFile multipartFile = songForm.getLink();
        String fileName =multipartFile.getOriginalFilename();
        try {
            FileCopyUtils.copy(songForm.getLink().getBytes(), new File(fileUpload + fileName));
        }catch (Exception e) {
            e.printStackTrace();
        }
        Song song = new Song(songForm.getName(), songForm.getSinger(), songForm.getKindOfMusic(), fileName);
        songService.save(song);
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("songForm", songForm);
        modelAndView.addObject("message", "Create new song successfully");
        return modelAndView;
    }
}
