package gl51.service

import gl51.data.Ip
@Singleton
interface IPService {

    Ip fetchIp()
}
