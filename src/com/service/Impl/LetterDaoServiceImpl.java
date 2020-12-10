package com.service.Impl;

import com.entity.Letter;
import com.service.LetterDaoService;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/10 11:03
 * 描述:
 */
public class LetterDaoServiceImpl implements LetterDaoService {
    @Override
    public List<Letter> queryByAcceptId(Integer acceptId, String acceptname) {
        return null;
    }

    @Override
    public List<Letter> queryBySendId(Integer sendId, String sendname) {
        return null;
    }

    @Override
    public int insert(Letter letter) {
        return 0;
    }
}
