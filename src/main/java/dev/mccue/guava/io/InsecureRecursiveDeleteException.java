/*
 * Copyright (C) 2014 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package dev.mccue.guava.io;

import java.nio.file.FileSystemException;
import java.nio.file.SecureDirectoryStream;
import dev.mccue.jsr305.CheckForNull;

/**
 * Exception indicating that a recursive delete can't be performed because the file system does not
 * have the support necessary to guarantee that it is not vulnerable to race conditions that would
 * allow it to delete files and directories outside of the directory being deleted (i.e., {@code
 * SecureDirectoryStream} is not supported).
 *
 * <p>{@code RecursiveDeleteOption#ALLOW_INSECURE} can be used to force the recursive delete method
 * to proceed anyway.
 *
 * @since 21.0 (but only since 33.4.0 in the Android flavor)
 * @author Colin Decker
 */
// java.nio.file
@ElementTypesAreNonnullByDefault
public final class InsecureRecursiveDeleteException extends FileSystemException {

  public InsecureRecursiveDeleteException(@CheckForNull String file) {
    super(file, null, "unable to guarantee security of recursive delete");
  }
}
