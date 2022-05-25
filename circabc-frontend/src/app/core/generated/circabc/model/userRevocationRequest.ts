/**
 * CIRCABC REST API
 * This is the first version of the CIRCABC REST API used by the new User Interface 
 *
 * The version of the OpenAPI document: 4.2.0
 * Contact: DIGIT-CIRCABC-SUPPORT@ec.europa.eu
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


export interface UserRevocationRequest { 
    id?: number;
    userIds?: Array<string>;
    revocationDate?: string;
    requester?: string;
    requestState?: number;
    jobStarted?: string;
    jobEnded?: string;
    /**
     * used only when cleaing the permission of members of a group
     */
    groupId?: string;
    /**
     * specify the type of revocation
     */
    action?: UserRevocationRequest.ActionEnum;
}
export namespace UserRevocationRequest {
    export type ActionEnum = 'clean-permission' | 'revoke';
    export const ActionEnum = {
        CleanPermission: 'clean-permission' as ActionEnum,
        Revoke: 'revoke' as ActionEnum
    };
}


