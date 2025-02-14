/**
 * ownCloud Android client application
 *
 * Copyright (C) 2020 ownCloud GmbH.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License version 2,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.owncloud.android.domain.files.usecases

import com.owncloud.android.domain.BaseUseCaseWithResult
import com.owncloud.android.domain.files.FileRepository
import com.owncloud.android.domain.files.model.FileListOption
import com.owncloud.android.domain.files.model.OCFile

class GetSearchFolderContentUseCase(
    private val repository: FileRepository
) : BaseUseCaseWithResult<List<OCFile>, GetSearchFolderContentUseCase.Params>() {

    override fun run(params: Params) = repository.getSearchFolderContent(
        fileListOption = params.fileListOption,
        folderId = params.folderId,
        search = params.search
    )

    data class Params(
        val fileListOption: FileListOption,
        val folderId: Long,
        val search: String
    )

}
