/*
 * ownCloud Android client application
 *
 * @author Fernando Sanz Velasco
 * Copyright (C) 2021 ownCloud GmbH.
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
 *
 */

package com.owncloud.android.testutil

import com.owncloud.android.domain.automaticuploads.model.FolderBackUpConfiguration
import com.owncloud.android.domain.automaticuploads.model.UploadBehavior
import com.owncloud.android.data.folderbackup.db.FolderBackUpEntity
import com.owncloud.android.domain.automaticuploads.model.AutomaticUploadsConfiguration

val OC_BACKUP = FolderBackUpConfiguration(
    accountName = "",
    behavior = UploadBehavior.COPY,
    sourcePath = "/Photos",
    uploadPath = "/Photos",
    wifiOnly = true,
    chargingOnly = true,
    lastSyncTimestamp = 1542628397,
    name = "",
    spaceId = null,
)

val OC_BACKUP_ENTITY = FolderBackUpEntity(
    accountName = "",
    behavior = UploadBehavior.COPY.name,
    sourcePath = "/Photos",
    uploadPath = "/Photos",
    wifiOnly = true,
    chargingOnly = true,
    lastSyncTimestamp = 1542628397,
    name = "",
    spaceId = null,
)

val OC_AUTOMATIC_UPLOADS_CONFIGURATION = AutomaticUploadsConfiguration(
    pictureUploadsConfiguration = OC_BACKUP,
    videoUploadsConfiguration = OC_BACKUP
)
