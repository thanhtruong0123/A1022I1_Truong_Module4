package com.codegym.service;

import com.codegym.model.Dictionary;
import com.codegym.repository.DictionaryRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DictionaryServiceImpl implements DictionaryService {
    private DictionaryRepository dictionaryRepository;

    public DictionaryServiceImpl(DictionaryRepository dictionaryRepository) {
        this.dictionaryRepository = dictionaryRepository;
    }

    @Override
    public Dictionary getDictionaryByVie(String vieWord) {
        return dictionaryRepository.getDictionaryByVie(vieWord);
    }

    @Override
    public Dictionary getDictionaryByEng(String engWord) {
        return dictionaryRepository.getDictionaryByEng(engWord);
    }
}
