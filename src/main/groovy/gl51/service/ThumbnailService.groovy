package gl51.service

import gl51.data.Picture
@Singleton
interface ThumbnailService {
    Picture generateThumbnail();
}