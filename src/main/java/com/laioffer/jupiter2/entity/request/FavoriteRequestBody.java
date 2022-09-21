package com.laioffer.jupiter2.entity.request;

import com.laioffer.jupiter2.entity.db.Item;
import com.fasterxml.jackson.annotation.JsonProperty;

public class FavoriteRequestBody
{
    @JsonProperty("favorite")
    private Item favoriteItem;

    public Item getFavoriteItem()
    {
        return favoriteItem;
    }
}

