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


/**
 * the representation of an access profile definition inside an Interest Group
 */
export interface Profile { 
    id?: string;
    name?: string;
    /**
     * The object that is used to compile all the translations of a node into a JSON object. It is basically composed of a map with a key languaguage code and its value 
     */
    title?: { [key: string]: string; };
    groupName?: string;
    permissions?: { [key: string]: string; };
    imported?: boolean;
    /**
     * in the case the profile is imported from another group, it is the IG nodeRef from which it has been imported 
     */
    importedRef?: string;
    exported?: boolean;
    /**
     * in the case the profile is exported and imported at least once in an IG, it is the list of all the IGs in which the profile has been imported into 
     */
    exportedRefs?: Array<string>;
}

