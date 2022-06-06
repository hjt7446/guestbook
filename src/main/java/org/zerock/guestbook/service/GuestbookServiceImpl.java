package org.zerock.guestbook.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.zerock.guestbook.dto.GuestbookDTO;
import org.zerock.guestbook.entity.Guestbook;
import org.zerock.guestbook.repository.GuestbookRepository;

@Service
@Slf4j
@RequiredArgsConstructor
public class GuestbookServiceImpl implements GuestbookService{

    private final GuestbookRepository repository;
    @Override
    public Long register(GuestbookDTO dto) {
        log.info("DTO----------------------------");
        log.info(String.valueOf(dto));

        Guestbook entity = dtoToEntity(dto);

        log.info(String.valueOf(entity));

        repository.save(entity);

        return entity.getGno();
    }
}
