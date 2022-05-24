package com.quanlybenhan.controller;

import com.quanlybenhan.entity.BenhAn;
import com.quanlybenhan.repository.BenhNhanRepository;
import com.quanlybenhan.service.Imp.IBenhAnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("api/benhAn")
public class BenhAnController {

    @Autowired
    private IBenhAnService iBenhAnService;

    @Autowired
    private BenhNhanRepository benhNhanRepository;

//    @ModelAttribute("ListBenhNhan")
//    public List<BenhNhan> benhNhanList() {
//        return benhNhanRepository.findAll();
//    }


//    @GetMapping()
//    public ModelAndView list(Optional<String> key_search, Optional<Integer> benhNhanId, @PageableDefault(size = 3) Pageable pageable) {
//        ModelAndView modelAndView = new ModelAndView("/list");
//        //Nếu key_search không có giá trị, tức là người dùng không nhập vào.
//        if (!key_search.isPresent()) {
//            //Nếu người dùng nhập vào ô category thì chạy.
//            if (benhNhanId.isPresent()) {
//                modelAndView.addObject("benhNhanId", benhNhanId.get());
//                modelAndView.addObject("benhAn", iBenhAnService.findAllByBenhNhanId(pageable, benhNhanId.get()));
//            } else {
//                //TH cả 2 ô điều không được nhập
//                modelAndView.addObject("benhAn", iBenhAnService.findAll(pageable));
//            }
//        } else {
//            //TH ô name được nhập
//            modelAndView.addObject("benhAn", iBenhAnService.findAllByName(pageable, key_search.get()));
//        }
//        return modelAndView;
//    }
    @GetMapping
    public ResponseEntity<List<BenhAn>> findByAll() {
        List<BenhAn> benhAnList = iBenhAnService.findAll();
        if (benhAnList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(benhAnList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BenhAn> findById(@PathVariable("id") Integer id) {
        Optional<BenhAn> benhAn = iBenhAnService.findById(id);
        if (benhAn.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<BenhAn>(benhAn.get(), HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<BenhAn> updateBenhAn(@PathVariable("id") Integer id, @RequestBody BenhAn benhAn) {
        Optional<BenhAn> updateBenhAn = iBenhAnService.findById(id);
        if (benhAn == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iBenhAnService.save(benhAn);
        return new ResponseEntity<>(updateBenhAn.get(), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<BenhAn> updateBenhAn(@PathVariable("id") Integer id) {
        Optional<BenhAn> benhAn = iBenhAnService.findById(id);
        if (benhAn.isPresent()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        iBenhAnService.remove(id);
        return new ResponseEntity<BenhAn>(benhAn.get(), HttpStatus.OK);
    }
}
