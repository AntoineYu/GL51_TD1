package gl51.service

import gl51.data.Ip

/**
 * ceci convertit des IP en string
 */
@Singleton
interface IpConverterService {

    /**
     * convertit une IP en string
     * @return
     */
    String getAndConvertIp()
}
