/**
--| ADAPTIVE RUNTIME PLATFORM |----------------------------------------------------------------------------------------

(C) Copyright 2013-2015 Carlos Lozano Diez t/a Adaptive.me <http://adaptive.me>.

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the
License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 . Unless required by appli-
-cable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS,  WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the  License  for the specific language governing
permissions and limitations under the License.

Original author:

    * Carlos Lozano Diez
            <http://github.com/carloslozano>
            <http://twitter.com/adaptivecoder>
            <mailto:carlos@adaptive.me>

Contributors:

    * Ferran Vila Conesa
             <http://github.com/fnva>
             <http://twitter.com/ferran_vila>
             <mailto:ferran.vila.conesa@gmail.com>

    * See source code files for contributors.

Release:

    * @version v2.2.0

-------------------------------------------| aut inveniam viam aut faciam |--------------------------------------------
*/

package me.adaptive.arp.api;

/**
   Interface for Managing the File operations

   @author Carlos Lozano Diez
   @since v2.0
   @version 1.0
*/
public interface IFile extends IBaseData {
     /**
        Determine whether the current file/folder can be read from.

        @param descriptor File descriptor of file or folder used for operation.
        @return True if the folder/file is readable, false otherwise.
        @since v2.0
     */
     boolean canRead(FileDescriptor descriptor);

     /**
        Determine whether the current file/folder can be written to.

        @param descriptor File descriptor of file or folder used for operation.
        @return True if the folder/file is writable, false otherwise.
        @since v2.0
     */
     boolean canWrite(FileDescriptor descriptor);

     /**
        Creates a file with the specified name.

        @param descriptor File descriptor of file or folder used for operation.
        @param callback   Result of the operation.
        @since v2.0
     */
     void create(FileDescriptor descriptor, IFileResultCallback callback);

     /**
        Deletes the given file or path. If the file is a directory and contains files and or subdirectories, these will be
deleted if the cascade parameter is set to true.

        @param descriptor File descriptor of file or folder used for operation.
        @param cascade    Whether to delete sub-files and sub-folders.
        @return True if files (and sub-files and folders) whether deleted.
        @since v2.0
     */
     boolean delete(FileDescriptor descriptor, boolean cascade);

     /**
        Check whether the file/path exists.

        @param descriptor File descriptor of file or folder used for operation.
        @return True if the file exists in the filesystem, false otherwise.
        @since v2.0
     */
     boolean exists(FileDescriptor descriptor);

     /**
        Loads the content of the file.

        @param descriptor File descriptor of file or folder used for operation.
        @param callback   Result of the operation.
        @since v2.0
     */
     void getContent(FileDescriptor descriptor, IFileDataLoadResultCallback callback);

     /**
        Returns the file storage type of the file

        @param descriptor File descriptor of file or folder used for operation.
        @return Storage Type file
        @since v2.0
     */
     IFileSystemStorageType getFileStorageType(FileDescriptor descriptor);

     /**
        Returns the file type

        @param descriptor File descriptor of file or folder used for operation.
        @return Returns the file type of the file
        @since v2.0
     */
     IFileSystemType getFileType(FileDescriptor descriptor);

     /**
        Returns the security type of the file

        @param descriptor File descriptor of file or folder used for operation.
        @return Security Level of the file
        @since v2.0
     */
     IFileSystemSecurity getSecurityType(FileDescriptor descriptor);

     /**
        Check whether this is a path of a file.

        @param descriptor File descriptor of file or folder used for operation.
        @return true if this is a path to a folder/directory, false if this is a path to a file.
        @since v2.0
     */
     boolean isDirectory(FileDescriptor descriptor);

     /**
        List all the files matching the speficied regex filter within this file/path reference. If the reference
is a file, it will not yield any results.

        @param descriptor File descriptor of file or folder used for operation.
        @param regex      Filter (eg. *.jpg, *.png, Fil*) name string.
        @param callback   Result of operation.
        @since v2.0
     */
     void listFilesForRegex(FileDescriptor descriptor, String regex, IFileListResultCallback callback);

     /**
        List all the files contained within this file/path reference. If the reference is a file, it will not yield
any results.

        @param descriptor File descriptor of file or folder used for operation.
        @param callback   Result of operation.
        @since v2.0
     */
     void listFiles(FileDescriptor descriptor, IFileListResultCallback callback);

     /**
        Creates the parent path (or paths, if recursive) to the given file/path if it doesn't already exist.

        @param descriptor File descriptor of file or folder used for operation.
        @param recursive  Whether to create all parent path elements.
        @return True if the path was created, false otherwise (or it exists already).
        @since v2.0
     */
     boolean mkDir(FileDescriptor descriptor, boolean recursive);

     /**
        Moves the current file to the given file destination, optionally overwriting and creating the path to the
new destination file.

        @param source      File descriptor of file or folder used for operation as source.
        @param destination File descriptor of file or folder used for operation as destination.
        @param createPath  True to create the path if it does not already exist.
        @param callback    Result of the operation.
        @param overwrite   True to create the path if it does not already exist.
        @since v2.0
     */
     void move(FileDescriptor source, FileDescriptor destination, boolean createPath, boolean overwrite, IFileResultCallback callback);

     /**
        Sets the content of the file.

        @param descriptor File descriptor of file or folder used for operation.
        @param content    Binary content to store in the file.
        @param callback   Result of the operation.
        @since v2.0
     */
     void setContent(FileDescriptor descriptor, byte[] content, IFileDataStoreResultCallback callback);

}

/**
------------------------------------| Engineered with ♥ in Barcelona, Catalonia |--------------------------------------
*/
