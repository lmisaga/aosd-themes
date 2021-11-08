package com.company.repository;

import java.util.List;

public interface BaseRepository<T> {

	T getOne();

	List<T> getAll();

}
