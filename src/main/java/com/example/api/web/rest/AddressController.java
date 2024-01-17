package com.example.api.web.rest;

import com.example.api.domain.model.AddressDto;
import com.example.api.service.AddressService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {

    private final AddressService service;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<AddressDto> findAll(Pageable pageable) {
        return service.findAll(pageable);
    }
}
