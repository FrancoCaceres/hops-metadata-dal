package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;

public interface S3ObjectInfoDataAccess<T> extends EntityDataAccess {

  int countAll() throws StorageException;

  T findById(long objectId, long inodeId) throws StorageException;

  List<T> findByInodeId(long inodeId) throws StorageException;

  List<T> findByInodeIds(long[] inodeIds) throws StorageException;

  List<T> findAllS3Objects() throws StorageException;

  List<T> findByIds(long[] objectIds, long[] inodeIds) throws StorageException;

  void prepare(Collection<T> removed, Collection<T> newed,
               Collection<T> modified) throws StorageException;
}