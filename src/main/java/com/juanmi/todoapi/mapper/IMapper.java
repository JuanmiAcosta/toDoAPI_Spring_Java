package com.juanmi.todoapi.mapper;

public interface IMapper <In,Out>{
    public Out map(In in);
}
