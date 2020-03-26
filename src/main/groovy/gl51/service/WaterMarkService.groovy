package gl51.service

import gl51.data.Picture
@Singleton
interface WaterMarkService {
    void addWaterMark(Picture pic);
}
