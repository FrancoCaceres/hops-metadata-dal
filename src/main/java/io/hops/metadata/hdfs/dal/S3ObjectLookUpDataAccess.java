package io.hops.metadata.hdfs.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface S3ObjectLookUpDataAccess<T> extends EntityDataAccess {
  T findByObjectId(long objectId) throws StorageException;

  long[] findINodeIdsByObjectIds(long[] objectIds) throws StorageException;

  void prepare(Collection<T> modified, Collection<T> removed) throws StorageException;

  Map<Long, List<Long>> getINodeIdsForObjectIds(final long[] objectIds) throws StorageException;
}
