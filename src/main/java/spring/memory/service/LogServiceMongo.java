package spring.memory.service;

import org.springframework.stereotype.Service;
import spring.memory.model.Log;

import java.util.ArrayList;
import java.util.List;

@Service
public class LogServiceMongo implements LogService {

  @Override
  public List<Log> getData(int N) {
    List<Log> logs = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < N; j++) {
        for (int k = 0; k < N; k++) {
          Log log = new Log();
          log.ruc = "ruc" + i + j + k;
          log.businessName = "businessName" + i + j + k;
          log.request = "request" + i + j + k;
          log.response = "response" + i + j + k;
          log.thirdPartyRequestXml = "thirdPartyRequestXml" + i + j + k;
          log.thirdPartyResponseXml = "thirdPartyResponseXml" + i + j + k;
          log.requestDate = "requestDate" + i + j + k;
          log.responseDate = "responseDate" + i + j + k;
          log.thirdPartyServiceInvocationDate = "thirdPartyServiceInvocationDate" + i + j + k;
          log.thirdPartyServiceResponseDate = "thirdPartyServiceResponseDate" + i + j + k;
          log.objectTypeAndDocEntry = "objectTypeAndDocEntry" + i + j + k;
          log.seriesAndCorrelative = "seriesAndCorrelative" + i + j + k;
          logs.add(log);
        }
      }
    }
    return logs;
  }
}