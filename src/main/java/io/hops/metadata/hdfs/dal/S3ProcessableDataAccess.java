package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface S3ProcessableDataAccess<T> extends EntityDataAccess {
  T findByInodeId(long inodeId) throws StorageException;

  List<T> getNFirstAvailableForScheduling(int n, long minimumTimestamp) throws StorageException;

  List<T> findAllS3Processables() throws StorageException;

  // TODO FCG: include timestamp limit?
  List<T> getScheduledFor(String address) throws StorageException;

  void updateAll(List<T> processables) throws StorageException;

  void add(T processable) throws StorageException;

  void delete(T processable) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed, Collection<T> modified) throws StorageException;
}
