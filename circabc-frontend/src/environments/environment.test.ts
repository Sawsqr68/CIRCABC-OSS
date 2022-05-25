import { Environment } from 'environments/environment.interface';

/* eslint-disable */
export const environment: Environment = {
  production: true,
  alfrescoURL: '../service/api',
  circabcURL: '../service/circabc',
  serverURL: `${window.location.protocol}//${window.location.hostname}${
    window.location.port ? ':' + window.location.port : ''
  }/`,
  baseHref: '/ui/',
  nodeName: 'N1',
  showUiSwitch: false,
  environmentType: 'test',
  circabcRelease: 'ent',
  aresBridgeEnabled: false,
  aresBridgeServer: '',
  aresBridgeURL: '',
  aresBridgeKey: '',
  aresBridgeUiURL: '',
  analyticsURL: '',
  analyticsSiteId: 0,
  officeClientId: '32b07f1c-465c-477c-a325-f356ccc127e2',
  shareURL: '',
};
