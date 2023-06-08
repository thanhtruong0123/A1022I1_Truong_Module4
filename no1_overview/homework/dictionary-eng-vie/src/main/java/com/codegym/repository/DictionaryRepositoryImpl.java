package com.codegym.repository;

import com.codegym.model.Dictionary;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class DictionaryRepositoryImpl implements DictionaryRepository {
    private List<Dictionary> dictionaryList;

    public DictionaryRepositoryImpl() {
        dictionaryList = new ArrayList<>();
        dictionaryList.add(new Dictionary("Hello", "Xin Chao"));
        dictionaryList.add(new Dictionary("Sorry", "Xin Loi"));
        dictionaryList.add(new Dictionary("Sun", "Mat troi"));
        dictionaryList.add(new Dictionary("Moon", "Mat trang"));
        dictionaryList.add(new Dictionary("Star", "Ngoi sao"));
    }
    @Override
    public Dictionary getDictionaryByVie(String vieWord) {
        return dictionaryList.stream()
                .filter(dictionary -> dictionary.getVieWord().equals(vieWord.trim()))
                .findFirst()
                .orElse(null);
    }

    @Override
    public Dictionary getDictionaryByEng(String engWord) {
        return dictionaryList.stream()
                .filter(dictionary -> dictionary.getEngWord().equals(engWord.trim()))
                .findFirst()
                .orElse(null);
    }
}
