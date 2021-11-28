package com.codegym.model.service.Impl;

import com.codegym.model.bean.Dictionary;
import com.codegym.model.service.DictionaryService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DictionaryServiceImpl implements DictionaryService {
    private static Map<Integer, Dictionary> dictionaryMap = new HashMap<>();
    static {
        dictionaryMap.put(1, new Dictionary("hello","xin chao"));
        dictionaryMap.put(2, new Dictionary("bye","tam biet"));
        dictionaryMap.put(3, new Dictionary("troll","tro dua"));
        dictionaryMap.put(4, new Dictionary("magic","ao thuat"));
    }
    @Override
    public List<Dictionary> findAll() {
        return new ArrayList<>(dictionaryMap.values());
    }
}
