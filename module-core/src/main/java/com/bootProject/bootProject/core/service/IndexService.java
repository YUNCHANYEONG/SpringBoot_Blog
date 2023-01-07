package com.bootProject.bootProject.core.service;

import com.bootProject.bootProject.core.model.ImsIndex;
import com.bootProject.bootProject.core.repository.ImsIndexRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class IndexService {

    private final ImsIndexRepository imsIndexRepository;

    public ImsIndex read(Long idx) {
        return imsIndexRepository.findById(idx).get();
    }
}
