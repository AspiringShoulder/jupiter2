package com.laioffer.jupiter2.service;

public class TwitchException extends RuntimeException
{
    public TwitchException(String errorMessage)
    {
        super(errorMessage);
    }
}
