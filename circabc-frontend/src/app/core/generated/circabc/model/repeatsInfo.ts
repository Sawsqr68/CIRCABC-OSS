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
 * in case an event/meeting repeats, stores this information
 */
export interface RepeatsInfo { 
    mainOccurence?: RepeatsInfo.MainOccurenceEnum;
    timesOccurence?: RepeatsInfo.TimesOccurenceEnum;
    everyTimesOccurence?: RepeatsInfo.EveryTimesOccurenceEnum;
    times?: number;
    everyTime?: number;
}
export namespace RepeatsInfo {
    export type MainOccurenceEnum = 'OnlyOnce' | 'Times' | 'EveryTimes';
    export const MainOccurenceEnum = {
        OnlyOnce: 'OnlyOnce' as MainOccurenceEnum,
        Times: 'Times' as MainOccurenceEnum,
        EveryTimes: 'EveryTimes' as MainOccurenceEnum
    };
    export type TimesOccurenceEnum = 'Daily' | 'Weekly' | 'EveryTwoWeeks' | 'MonthlyByDate' | 'MonthlyByWeekday' | 'Yearly' | 'MondayToFriday' | 'MondayWednseyFriday' | 'TuesdayThursday';
    export const TimesOccurenceEnum = {
        Daily: 'Daily' as TimesOccurenceEnum,
        Weekly: 'Weekly' as TimesOccurenceEnum,
        EveryTwoWeeks: 'EveryTwoWeeks' as TimesOccurenceEnum,
        MonthlyByDate: 'MonthlyByDate' as TimesOccurenceEnum,
        MonthlyByWeekday: 'MonthlyByWeekday' as TimesOccurenceEnum,
        Yearly: 'Yearly' as TimesOccurenceEnum,
        MondayToFriday: 'MondayToFriday' as TimesOccurenceEnum,
        MondayWednseyFriday: 'MondayWednseyFriday' as TimesOccurenceEnum,
        TuesdayThursday: 'TuesdayThursday' as TimesOccurenceEnum
    };
    export type EveryTimesOccurenceEnum = 'days' | 'weeks' | 'months';
    export const EveryTimesOccurenceEnum = {
        Days: 'days' as EveryTimesOccurenceEnum,
        Weeks: 'weeks' as EveryTimesOccurenceEnum,
        Months: 'months' as EveryTimesOccurenceEnum
    };
}

