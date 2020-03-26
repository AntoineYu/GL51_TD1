package gl51.service.Impl;

import gl51.data.Picture;
import gl51.service.DbUpdateService;
import gl51.service.PictureFetchService;

import javax.inject.Inject;
import javax.inject.Singleton

@Singleton
public class DbUpdateServiceImpl implements DbUpdateService {

    @Inject PictureFetchService pictureFetchService;
    @Override
    public boolean updateDatabase() {
        Picture pic = pictureFetchService.fetchPicture();
        def name = pic.name;
        def path = pic.path
        // update database
        return true;
    }
}