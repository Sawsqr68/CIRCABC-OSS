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
import { ContentIdTranslationsEnhancedTitle } from './contentIdTranslationsEnhancedTitle';
import { ContentIdTranslationsEnhancedDynamicProperties } from './contentIdTranslationsEnhancedDynamicProperties';


export interface InlineObject3 { 
    name?: string;
    title?: ContentIdTranslationsEnhancedTitle;
    description?: ContentIdTranslationsEnhancedTitle;
    keywords?: Array<string>;
    author?: string;
    reference?: string;
    expirationDate?: string;
    securityRanking?: string;
    status?: string;
    isPivot?: boolean;
    lang?: string;
    dynamicProperties?: ContentIdTranslationsEnhancedDynamicProperties;
    fileName?: Blob;
}

