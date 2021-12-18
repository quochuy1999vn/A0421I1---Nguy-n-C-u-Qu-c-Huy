package music.controller;

import music.entity.Music;
import music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MusicController {

    @Qualifier("musicService")
    @Autowired
    IMusicService iMusicService;

    @GetMapping("list")
    public ModelAndView showList() {
        List<Music> musicList = iMusicService.findAll();

        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("musicList", musicList);
        return modelAndView;
    }

    @GetMapping("create")
    public ModelAndView showCreate() {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("music", new Music());
        return modelAndView;
    }

    @PostMapping("create")
    public ModelAndView create(@ModelAttribute("music") Music music) {
        iMusicService.save(music);

        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("music", new Music());
        modelAndView.addObject("message", "music create successfully");
        return modelAndView;
    }

    @GetMapping("edit/{id}")
    public ModelAndView showEdit(@PathVariable long id) {
        Music music = iMusicService.findById(id);
        if (music != null) {
            ModelAndView modelAndView = new ModelAndView("/edit");
            modelAndView.addObject("music", new ModelAndView());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("edit")
    public ModelAndView update (@ModelAttribute("music") Music music) {
        iMusicService.save(music);

        ModelAndView modelAndView = new ModelAndView("/edit");
        modelAndView.addObject("music", music);
        modelAndView.addObject("message", "Update successfully");
        return modelAndView;
    }

    @GetMapping("delete/{id}")
    public ModelAndView showDelete (@PathVariable long id) {
        Music music = iMusicService.findById(id);

        if (music != null) {
            ModelAndView modelAndView = new ModelAndView("/delete");
            modelAndView.addObject("music", new ModelAndView());
            return modelAndView;
        }else {
            ModelAndView modelAndView = new ModelAndView("/error.404");
            return modelAndView;
        }
    }

    @PostMapping("delete")
    public String delete (@ModelAttribute("music") Music music) {
        iMusicService.remove(music.getId());
        return "redirect: /list";
    }
}
