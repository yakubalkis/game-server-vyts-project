package com.game.server.rest.dto;

import lombok.Data;

@Data
public class CategoryRequest {
    private Long itemId;
    private String categoryName;
    private String symbol;
}
