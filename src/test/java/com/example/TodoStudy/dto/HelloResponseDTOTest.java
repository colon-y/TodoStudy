package com.example.TodoStudy.dto;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class HelloResponseDTOTest {

    @Test
    public void lombokTest() {
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDTO dto = new HelloResponseDTO(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}