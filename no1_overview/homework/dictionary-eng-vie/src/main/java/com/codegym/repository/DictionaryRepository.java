package com.codegym.repository;

import com.codegym.model.Dictionary;

public interface DictionaryRepository {
    Dictionary getDictionaryByVie(String vieWord);
    Dictionary getDictionaryByEng(String engWord);
}
