package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface S3ObjectDeletableDataAccess<T> extends EntityDataAccess {
  T findById(long id) throws StorageException;

  List<T> getNFirstAvailableForScheduling(int n, long minimumTimestamp) throws StorageException;

  List<T> getAll() throws StorageException;

  // TODO FCG: include timestamp limit?
  List<T> getScheduledFor(String address) throws StorageException;

  void updateAll(List<T> deletables) throws StorageException;

  void delete(T deletable) throws StorageException;

  void deleteAll(List<T> deletables) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
