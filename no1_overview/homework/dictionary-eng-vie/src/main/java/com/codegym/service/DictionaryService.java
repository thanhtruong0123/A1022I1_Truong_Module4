package com.codegym.service;

import com.codegym.model.Dictionary;

public interface DictionaryService {
    Dictionary getDictionaryByVie(String vieWord);
    Dictionary getDictionaryByEng(String engWord);
}
