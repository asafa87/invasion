package com.asafasher.invasion.mapper;

import org.springframework.data.domain.Page;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public abstract class Mapper<E, M> {

    public abstract M map(E t);

    public E unmap(M d) {
        throw new UnsupportedOperationException("Unmap not supported yet!");
    }

    public List<M> map(Iterable<E> tList) {
        return this.map(tList, Function.identity());
    }

    public List<M> map(Iterable<E> tList, Function<M, M> postProcessor) {
        return StreamSupport.stream(tList.spliterator(), false)
                .map(this::map)
                .map(postProcessor)
                .collect(Collectors.toList());
    }

    public List<E> unmap(Iterable<M> dList) {
        return StreamSupport.stream(dList.spliterator(), false)
                .map(this::unmap)
                .collect(Collectors.toList());
    }

}