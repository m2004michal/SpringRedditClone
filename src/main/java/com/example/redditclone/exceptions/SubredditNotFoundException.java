package com.example.redditclone.exceptions;

public class SubredditNotFoundException extends RuntimeException{
    public SubredditNotFoundException(String exMessage) {
        super(exMessage);
    }
}
