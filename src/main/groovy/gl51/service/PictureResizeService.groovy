package gl51.service

import gl51.data.Picture
@Singleton
interface PictureResizeService {
    Picture resizePicture(int width, int height);
}
