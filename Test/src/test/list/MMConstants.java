package test.list;

public final class MMConstants {

    /** The Constant MODE_MANAGER_REQ. */
    public static final byte    MODE_MANAGER_REQ           = 1;

    /** The Constant MODE_MANAGER_RESP. */
    public static final byte    MODE_MANAGER_RESP          = 11;
    
    /** The Constant NO_MODE. */
    public static final byte    NO_MODE                    = 4;

    /** The Constant SLEEPDATATRANSMISSION_MODE. */
    public static final byte    SLEEPDATATRANSMISSION_MODE = 6;

    /** The Constant SOFTWAREUPDATE_MODE. */
    public static final byte    SOFTWAREUPDATE_MODE        = 8;

    /** The Constant TIME_INTERVAL_SLEEP. */
    public static final int     TIME_INTERVAL_SLEEP        = 5000;

    /** The Constant TIME_INTERVAL_COMMON. */
    public static final int     TIME_INTERVAL_COMMON       = 1000;

    /** The Constant PROCESSING_TYPE1. */
    public static final byte    PROCESSING_TYPE1           = 1;

    /** The Constant PROCESSING_TYPE2. */
    public static final byte    PROCESSING_TYPE2           = 2;

    public static final long    SLEEPDATATX_TO_SLEEP       = 1000;

    public static final int     ALARM_INTERVAL             = 1;                                           // it is in Minutes

    public static final int     REGISTER_ID_USM            = 1;
    public static final int     REGISTER_ID_WIFI           = 2;
    public static final int     REGISTER_ID_GNSS           = 3;
    public static final int     REGISTER_ID_TELE           = 4;
    public static final int     REGISTER_ID_DB_MANAGER     = 5;
    public static final int     REGISTER_ID_CCM            = 6;
    public static final int     REGISTER_ID_SD             = 7;
    public static final int     REGISTER_ID_KEEPALIVE      = 8;
    public static final int     REGISTER_ID_HFOTA          = 9;
    public static final int     REGISTER_ID_RESERVE        = 0;
    
    public static final int     REGISTER_ID_SREBOOT        = 1;

    /* USB Topics */
    public static final String  USBASE                     = "com/bosch/itrams/usbmanager/";

    private static final String TELEBASE                   = "com/bosch/itrams/telephony/";
    /**
     * This Topic shall be received when HOST is connected
     */
    public static final String  HOSTCONNECTED              = USBASE + "HOSTCONNECTED";

    /**
     * This Topic shall be received when HOST is disconnected
     */
    public static final String  HOSTDISCONNECTED           = USBASE + "HOSTDISCONNECTED";

    /**
     * Topic with which application has to register for event raised by Telephony for SMS received
     */
    public static final String  SMSRECEIVED                = TELEBASE + "SMS_RECEIVED";

    /**
     * Topic with which application has to register for event raised by Telephony for Incoming Call
     */
    public static final String  CALLINCOMING               = TELEBASE + "CALL_INCOMING";

    public static final String  LABELBUNDLE                = "[Mode Manager]: ";

	public static final int SLEEP_MODE = 0x0102;

    /**
     * Instantiates a new MM constants.
     */
    private MMConstants() {
    }
}

