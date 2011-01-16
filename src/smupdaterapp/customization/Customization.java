package smupdaterapp.customization;

public class Customization {
    //The String from the build.prop before the Version
    public static final String RO_MOD_START_STRING = "SMBR-";
    //Minimum Supported Version (So the User has to install google apps and so before)
    public static final String MIN_SUPPORTED_VERSION_STRING = RO_MOD_START_STRING + "0.9.15";
    //Updateinstructions for the min supported Version
    public static final String UPDATE_INSTRUCTIONS_URL = "http://code.google.com/p/shadowmodbr/wiki/TutorialUpdate";
    //DB filename
    public static final String DATABASE_FILE = "smupdater.db";
    //DownloadDirectory
    public static final String DOWNLOAD_DIR = "OpenRecovery/updates";
    //MUST be the first package name.
    public static final String PACKAGE_FIRST_NAME = "smupdaterapp";
    //Filename for Instance save
    public static final String STORED_STATE_FILENAME = "smupdater.state";
    //Android Board type
    public static final String BOARD = "ro.product.board";
    //Name of the Current Rom
    public static final String SYS_PROP_MOD_VERSION = "ro.modversion";
}