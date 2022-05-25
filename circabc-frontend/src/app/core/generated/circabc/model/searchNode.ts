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
import { Node } from './node';
import { SearchNodeAllOf } from './searchNodeAllOf';
import { Attachment } from './attachment';


export interface SearchNode { 
    id?: string;
    type?: string;
    service?: SearchNode.ServiceEnum;
    name?: string;
    /**
     * The object that is used to compile all the translations of a node into a JSON object. It is basically composed of a map with a key languaguage code and its value 
     */
    title?: { [key: string]: string; };
    /**
     * The object that is used to compile all the translations of a node into a JSON object. It is basically composed of a map with a key languaguage code and its value 
     */
    description?: { [key: string]: string; };
    properties?: { [key: string]: string; };
    /**
     * Representation of the permissions given to the user making the call. To know what are the permissions for the specific node, the permission definition may vary depending on its type or service. 
     */
    permissions?: { [key: string]: string; };
    attachments?: Array<Attachment>;
    parentId?: string;
    notifications?: string;
    /**
     * true if the current user faved the node 
     */
    favourite?: boolean;
    hasSubFolders?: boolean;
    hasGuestAccess?: boolean;
    targetNode?: string;
    /**
     * To precise if it is a folder / post / event / file / etc.
     */
    resultType?: string;
}
export namespace SearchNode {
    export type ServiceEnum = 'library' | 'information' | 'events' | 'newsgroups' | 'directory';
    export const ServiceEnum = {
        Library: 'library' as ServiceEnum,
        Information: 'information' as ServiceEnum,
        Events: 'events' as ServiceEnum,
        Newsgroups: 'newsgroups' as ServiceEnum,
        Directory: 'directory' as ServiceEnum
    };
}


