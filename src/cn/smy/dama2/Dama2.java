package cn.smy.dama2;


public class Dama2 {
	{
		System.loadLibrary("Dama2Interface");
	}
	

	/**
	�����ܣ�����������ȡԭ������
	����������������GetOrigError
	    �û��ں������÷�������ʱ��ͨ���������᷵��һ���������ţ���������Ա�ύ��ƽ̨�����̲��Ҵ���Դ���롣
	������ֵ��������0 �ɹ� ���� - ԭ������
	������������������
	*/
	public native int getOrigError();
	/**
	�����ܣ��������������ʼ��
	����������������Init
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������pszSoftwareName�����31���ַ���
	����������������pszSoftwareID��32��16hex�ַ���ɣ�
	*/
	public native int init(String softwareName, String softwareID);
	
	/**
	�����ܣ����������������ʼ�����ͷ�ϵͳ��Դ
	����������������Uninit
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	������������������
	*/
	public native int uninit();
	

	/**
	�����ܣ����������û���¼
	����������������Login
	    ע�⣺   ������ֻ��Ҫ����һ�μ��ɣ�Login��������Ǳ��û��йصĴ������û�����������ȣ��⣬
	    �������ùܣ����������������ʱ�ڲ�������ٴε�½�������Ҫ�л��û���
	    �ɵ���Logoff���ٵ�¼�µ��û����������ṩ�������߲����˻�����test�����룺test���������������ʹ��2000��֡�
	DLL����
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[in]pszUserName���û��������31�ֽڣ�
	����������������[in]pszUserPassword�����룬���16�ֽڣ�
	����������������[in]pDyncVerificationCode����̬��֤�룬û�ж�̬��֤���ֱ�Ӵ�NULL��
	����������������[out]pszSysAnnouncementURL�����ش�����ƽ̨����URL������Ļ���������512�ֽڣ������߿����о����Ƿ��ڽ�������ʾ��
	����������������[out]pszAppAnnouncementURL�����ش����ÿ����ߺ�̨���Ѷ���Ĺ���URL������Ļ���������512�ֽڣ�
	*/
	public native int login(String userName, String userPassword, String dyncVCode, String [] retSysAnnouncement, String [] retAppAnnouncement);
	
	/**
	�����ܣ����������û��ǳ����û�ע��
	����������������Logoff
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	������������������
	*/
	public native int logoff();
	

	/**
	�����ܣ����������û�ע��
	����������������Register
	    ע�⣺     ��̬�뷢�ͷ�ʽ��Ϊ��1���ֻ���2�����䣻3���ֻ������䣬
	    �˹�����Ч�ط�ֹ�û��˺ű����ã�����û���ص�¼�������Ҫ����ʱ��
	    ����Ҫʹ�ö�̬��֤����֤��ȷ���û��˻���ȫ��
	DLL����
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������pszUserName - �û��������31���ֽ�
	����������������pszUserPassword - ���룬���16�ֽ�
	����������������pszQQ - QQ���룬��Ϊ�գ����16�ֽ�
	����������������pszTelNo - �ֻ����룬���16�ֽڣ������̬�뷢�ͷ�ʽΪ1��3���ֻ��������
	����������������pszEmail - ���䣬���48�ֽڣ������̬�뷢�ͷ�ʽΪ2��3�����������
	����������������nDyncSendMode - ��̬�뷢�ͷ�ʽ��1�ֻ� 2���� 3�ֻ�������
	*/
	public native int register(String userName, String userPassword, String qq, String telNo, String email, int nDyncVCodeSendMode);
	
	/**
	�����ܣ����������û���ֵ
	����������������Recharge
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[in]pszUserName - ��ֵ�û��������32�ֽ�
	����������������[in]pszCardNo - ��ֵ���ţ�32�ֽ�
	����������������[out]pulBalance - �����û���ֵ������
	*/
	public native int recharge(String userName, String cardNo, long[] balance);
	
	/**
	�����ܣ�����������ѯ�û����
	����������������QueryBalance
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[out]pulBalance�������û������֣�
	*/
	public native int queryBalance(long [] balance);
	
	/**
	�����ܣ�����������ȡ�û���Ϣ
	����������������ReadInfo
	     ��ȡ�û���Ϣ������QQ�š��ֻ������䡢��̬�뷢�ͷ�ʽ����Ϣ��
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[out]pszUserName - �û��������뻺������С��32�ֽ�
	����������������[out]pszQQ - QQ���룬���뻺������С��16�ֽ�
	����������������[out]pszTelNo - �ֻ����룬���뻺������С��16�ֽ�
	����������������[out]pszEmail - ���䣬���뻺������С��48�ֽ�
	����������������[out]pDyncSendMode - ��̬�뷢�ͷ�ʽ
	*/
	public native int readInfo(String [] userName, String [] qq, String [] telNo, String [] email, int []nDyncVCodeSendMode);
	


	/**
	�����ܣ����������޸ĵ�¼�û���Ϣ
	����������������ChangeInfo
	    ��ʹ�ñ�����ʵ���޸��û����ϡ����ܵȹ��ܡ�
	�޸��û���Ϣ������Ҫ������Ϊ���û��˺Ű�ȫ����ҪУ���û���̬��֤�룬����Ҫ�������ε��á�
	�ڵ���ʱ���ر�ע�⣺
	��һ�Σ�pszDyncVCode���յ����޸����ϣ�ƽ̨�᷵��DAMA2_RET_NEED_DYNC_VCODE�Ĵ����룬�����û����Ͷ�̬��֤�룬�����ߴ�ʱ��Ҫ��ʾ�û����붯̬��֤�롣
	�ڶ��Σ����û�����Ķ�̬��֤���pszDyncVCode�ٴε��ñ�������
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������pUserOldPassword - �����룬���16�ֽ�
	����������������pUserNewPassword - �����룬���16�ֽ�
	����������������pszQQ - QQ���룬��Ϊ�գ����16�ֽ�
	����������������pszTelNo - �ֻ����룬���16�ֽڣ������̬�뷢�ͷ�ʽΪ1��3���ֻ��������
	����������������pszEmail - ���䣬���48�ֽڣ������̬�뷢�ͷ�ʽΪ2��3�����������
	����������������pszDyncVCode - ��̬��֤�룬��һ�ε��ÿɴ�NULL�����ж�̬��֤��������û�����Ķ�̬���ٴε��á�
	����������������nDyncSendMode - ��̬�뷢�ͷ�ʽ��1�ֻ� 2���� 3�ֻ�������
	*/
	public native int changeInfo(String oldPassword, String newPassword, String qq, String telNo, String email, String dyncVCode, int nDyncVCodeSendMode);
	
	

	/**
	�����ܣ����������������
	    ��������������Decode
	    ��ʽһ��Decode ͨ��������֤��ͼƬURL��ַ������룬�ɴ����ÿؼ����������ϴ�������ʡʱʡ��
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[in]pszFileURL - ��֤��ͼƬURL���511
	����������������[in]pszCookie - ��ȡ��֤������Cookie���4095�ֽ�
	����������������[in]pszReferer - ��ȡ��֤������Referer���511�ֽ�
	����������������[in]ucVerificationCodeLen - ��֤�볤�ȣ�������ȷ����֤�볤�ȣ������ȱ�ʶ��������Ȳ������ɴ�0
	����������������[in]usTimeout - ��֤�볬ʱʱ�䣬���������֤�뽫ʧЧ����λ�롣�Ƽ�120
	����������������[in]ulVCodeTypeID - ��֤������ID����ͨ�������ÿ����ߺ�̨����ӵ����������Լ���������õ�����֤�����ͣ�����ȡ���ɵ�ID
	����������������[in]bDownloadPictureByLocalMachine - �Ƿ񱾻����أ���Ϊ��Щ��֤���IP��������Զ�̻�ȡ������˱�־ΪTRUE��������ÿؼ��������������Զ�����ͼƬ���ϴ���
	����������������������������������������������������û�д����Ƶ���֤�룬�����ɴ����û������أ�Ч�ʸ��ߣ�������FALSE
	����������������[out]pulRequestID - ��������ID��Ϊ�����GetResultȡ���������á�
	*/
	public native int decode(String url, String cookie, String referer, byte vcodeLen, short timeout, long vcodeTypeID, boolean downloadFromLocalMachine, long [] requestID);


	/**
	�����ܣ����������������
	����������������DecodeBuf
	     ��ʽ����DecodeBuf 1��ͨ��������֤��ͼƬ������������룬��������Ҫ�������ز�����֤��ͼƬ�����ͼƬ���ݺ���ñ�����������룻2��ʶ���ı�����3+5=��
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[in]pImageData - ��֤��ͼƬ���� ���˴�Ҳ��ֱ����д�ı����磺3+8+3=���� �й����׶������ ��ע��pszExtName�͵ù̶���д"TXT"����
	����������������[in]dwDataLen - ��֤��ͼƬ���ݻ���֤���ı����ݳ��ȣ���pImageData��С������4M
	����������������[in]pszExtName - ͼƬ��չ������JPEG��BMP��PNG��GIF�����pImageData����ͼƬ���ݶ����ı�������д"TXT"����
	����������������[in]ucVerificationCodeLen - ��֤�볤�ȣ�������ȷ����֤�볤�ȣ������ȱ�ʶ��������Ȳ������ɴ�0
	����������������[in]usTimeout - ��֤�볬ʱʱ�䣬���������֤�뽫ʧЧ����λ�롣�Ƽ�120
	����������������[in]ulVCodeTypeID - ��֤������ID����ͨ�������ÿ����ߺ�̨����ӵ����������Լ���������õ�����֤�����ͣ�����ȡ���ɵ�ID
	����������������[out]pulRequestID - ��������ID��Ϊ�����GetResultȡ���������á�
	*/
	public native int decodeBuf(byte [] data, String extName, byte vcodeLen, short timeout, long vcodeTypeID, long [] requestID);
	

	/**
	�����ܣ����������������
	����������������DecodeWnd
	��ʽ����DecodeWnd ���봰�ڶ��崮�������ø��������ָ�����ڽ�ͼ���ϴ��������
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[in]pszWndDef - ���ڶ����ִ��������������
	����������������[in]lpRect - Ҫ��ȡ�Ĵ������ݾ���(����ڴ��������Ͻ�),NULL��ʾ��ȡ������������
	����������������[in]ucVerificationCodeLen - ��֤�볤�ȣ�������ȷ����֤�볤�ȣ������ȱ�ʶ��������Ȳ������ɴ�0
	����������������[in]usTimeout - ��֤�볬ʱʱ�䣬���������֤�뽫ʧЧ����λ�롣�Ƽ�120
	����������������[in]ulVCodeTypeID - ��֤������ID����ͨ�������ÿ����ߺ�̨����ӵ����������Լ���������õ�����֤�����ͣ�����ȡ���ɵ�ID
	����������������[out]pulRequestID - ��������ID��Ϊ�����GetResultȡ���������á�
	*/
	public native int decodeWnd(String wndDef, int x, int y, int cx, int cy, byte vcodeLen, short timeout, long vcodeTypeID, long [] requestID);


	/**
	�����ܣ���������ȡ��֤��ʶ����
	����������������GetResult
	    ע�⣺ȡʶ����֮ǰ��Ҫ�����������Decode���������ķ�������ȡ������ID(ulRequestID)��
	    ͨ������ID��ȡ��֤��ʶ������
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������[in]ulRequestID - ��֤������ID����Decode��DecodeBuf��DecodeWnd�Ⱥ�������
	����������������[in]ulTimeout - GetResult�����ȴ���ʱʱ��(��λΪ����)�������0�������������������أ��������ֵΪERR_CC_NO_RESULT�������ɿ�����ѭ������ֱ�����سɹ�����������
	���������������������������������������Ч��ʱʱ�䣬�����������ȴ����������ȵ�������������أ�û�ȵ����ڳ�ʱʱ��󷵻ء�
	����������������[out]pszVCode - ��֤��ʶ��������ͨ������������ʶ����
	����������������[in]ulVCodeBufLen - ������֤��ʶ������������С����pszVCode��������С
	����������������[out]pulVCodeID - ������֤��ID��������óɹ�ȡ����֤�������������豣�����֤��ID������ReportResult����������֤�����ĳɹ�ʧ��״̬��
	����������������[out]pszReturnCookie - ����������֤��ͼƬʱ���ص�Cookie
	����������������[in]ulCookieBufferLen - ���մ���cookie�Ļ�������С����pszReturnCookie�Ĵ�С
	*/
	public native int getResult(long requestID, long waitTimeout, String [] vcode, long [] vcodeID, String [] retCookie);
	

	/**
	�����ܣ���������������֤������ȷ�ԣ�ʧ�ܲű����ɹ����Բ��ñ��� 
	     ע�⣺��GetResult�ɹ��󣬿������ܻ�ȡ����֤��ID��ʹ����֤��ID��������֤�����ȷ�ԣ�bCorrect���ΪTRUE��������֤����ȷ��ΪFALSE�������֤�����
	����������������ReportResult
	������ֵ��������0 �ɹ�, ����ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������ulVCodeID - ��֤��ID��ʹ��GetResult�������ص���֤��ID
	����������������bCorrect - TRUE��ȷ FALSE ����
	*/
	public native int reportResult(long vcodeID, boolean correct);
	
	/**
	�����ܣ���������һ��ʽͨ��ͼƬ����������룬���ô˺���֮ǰ�������ٵ��ó�ʼ������¼�Ⱥ���
	����������������D2Buf
	������ֵ��������>0 �ɹ���������֤��ID�����ڵ���ReportResult��, <0ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������Ӧ��ͣ������Ĵ����������-1~-199�����������û����󣩡�-208��������ã���-210���Ƿ��û�����-301�����ô���DLL�Ҳ�����
	����������������[in]pszSoftwareID - ���KEY����ȡ������http://wiki.dama2.com/index.php?n=ApiDoc.GetSoftIDandKEY��
	����������������[in]pszUserName - �������û�����ע�����û��˺ţ������ǿ������˺ţ�
	����������������[in]pszUserPassword - �������û�����
	����������������[in]pImageData - ��֤��ͼƬ�����ֽڼ� 
	����������������[in]dwDataLen - ��֤��ͼƬ���ݻ���֤���ı����ݳ��ȣ���pImageData��С������4M
	����������������[in]usTimeout - ��֤�볬ʱʱ�䣬���������֤�뽫ʧЧ����λ�롣�Ƽ�60�������֤��ʶ��ɹ��������������أ�������������һֱ����ʱʱ�䷵��
	����������������[in]ulVCodeTypeID - ��֤������ID�������֤�����ͱ����ҵ�����֤�������ID��http://wiki.dama2.com/index.php?n=ApiDoc.GetSoftIDandKEY û���ʺ���������ϵ�����ò���
	����������������[out]pszVCodeText - ������֤�����ַ������鴫��30�ֽڻ�����
	*/
	public native int d2Buf(String softwareID, String userName, String userPassword, byte [] data, short timeout, long vcodeTypeID, String [] retVCodeText);
	
	/**
	�����ܣ���������һ��ʽͨ������ͼƬ�ļ���������룬���ô˺���֮ǰ�������ٵ��ó�ʼ������¼�Ⱥ���
	����������������D2File
	������ֵ��������>0 �ɹ���������֤��ID�����ڵ���ReportResult��, <0ʧ�ܣ���������붨�� http://wiki.dama2.com/index.php?n=ApiDoc.ErrDef 
	����������������Ӧ��ͣ������Ĵ����������-1~-199�����������û����󣩡�-208��������ã���-210���Ƿ��û�����-301�����ô���DLL�Ҳ�����
	����������������[in]pszSoftwareID - ���KEY����ȡ������http://wiki.dama2.com/index.php?n=ApiDoc.GetSoftIDandKEY��
	����������������[in]pszUserName - �������û�����ע�����û��˺ţ������ǿ������˺ţ�
	����������������[in]pszUserPassword - �������û�����
	����������������[in]pszFilePath - ����ͼƬ�ļ�·�� �磺c:\a.jpg���뿪����ע�⣬ͼƬ�ļ���ȡʱ���ȡ��֤�����򼴿ɣ�̫���ͼƬ�ļ�����Ӱ��ʶ���ٶ�
	����������������[in]usTimeout - ��֤�볬ʱʱ�䣬���������֤�뽫ʧЧ����λ�롣�Ƽ�60�������֤��ʶ��ɹ��������������أ�������������һֱ����ʱʱ�䷵��
	����������������[in]ulVCodeTypeID - ��֤������ID�������֤�����ͱ����ҵ�����֤�������ID��http://wiki.dama2.com/index.php?n=ApiDoc.GetSoftIDandKEY û���ʺ���������ϵ�����ò���
	����������������[out]pszVCodeText - ������֤�����ַ������鴫��30�ֽڻ�����
	*/
	public native int d2File(String softwareID, String userName, String userPassword, String fileName, short timeout, long vcodeTypeID, String [] retVCodeText);
	
//error code definition	
	//success code
	static final int ERR_CC_SUCCESS					=0;
		//parameter error
	static final int ERR_CC_SOFTWARE_NAME_ERR		=-1;
	static final int ERR_CC_SOFTWARE_ID_ERR			=-2;
	static final int ERR_CC_FILE_URL_ERR			=-3;
	static final int ERR_CC_COOKIE_ERR				=-4;
	static final int ERR_CC_REFERER_ERR				=-5;
	static final int ERR_CC_VCODE_LEN_ERR			=-6;
	static final int ERR_CC_VCODE_TYPE_ID_ERR		=-7;
	static final int ERR_CC_POINTER_ERROR			=-8;
	static final int ERR_CC_TIMEOUT_ERR				=-9;
	static final int ERR_CC_INVALID_SOFTWARE		=-10;
	static final int ERR_CC_COOKIE_BUFFER_TOO_SMALL	=-11;
	static final int ERR_CC_PARAMETER_ERROR			=-12;
		//user error
	static final int ERR_CC_USER_ALREADY_EXIST		=-100;
	static final int ERR_CC_BALANCE_NOT_ENOUGH		=-101;
	static final int ERR_CC_USER_NAME_ERR			=-102;
	static final int ERR_CC_USER_PASSWORD_ERR		=-103;
	static final int ERR_CC_QQ_NO_ERR				=-104;
	static final int ERR_CC_EMAIL_ERR				=-105;
	static final int ERR_CC_TELNO_ERR				=-106;
	static final int ERR_CC_DYNC_VCODE_SEND_MODE_ERR=-107;
	static final int ERR_CC_INVALID_CARDNO			=-108;
	static final int ERR_CC_DYNC_VCODE_OVERFLOW		=-109;
	static final int ERR_CC_DYNC_VCODE_TIMEOUT		=-110;
	static final int ERR_CC_USER_SOFTWARE_NOT_MATCH	=-111;
	static final int ERR_CC_NEED_DYNC_VCODE			=-112;
		//logic error
	static final int ERR_CC_NOT_LOGIN				=-201;
	static final int ERR_CC_ALREADY_LOGIN			=-202;
	static final int ERR_CC_INVALID_REQUEST_ID		=-203;		//invalid request id, perhaps request is timeout
	static final int ERR_CC_INVALID_VCODE_ID		=-204;		//invalid captcha id, perhaps request is timeout
	static final int ERR_CC_NO_RESULT				=-205;
	static final int ERR_CC_NOT_INIT_PARAM			=-206;
	static final int ERR_CC_ALREADY_INIT_PARAM		=-207;
	static final int ERR_CC_SOFTWARE_DISABLED		=-208;
	static final int ERR_CC_NEED_RELOGIN			=-209;
	static final int EER_CC_ILLEGAL_USER			=-210;
	static final int EER_CC_REQUEST_TOO_MUCH		=-211;		//concurrent request is too much

		//system error
	static final int ERR_CC_CONFIG_ERROR			=-301;
	static final int ERR_CC_NETWORK_ERROR			=-302;
	static final int ERR_CC_DOWNLOAD_FILE_ERR		=-303;
	static final int ERR_CC_CONNECT_SERVER_FAIL		=-304;
	static final int ERR_CC_MEMORY_OVERFLOW			=-305;
	static final int ERR_CC_SYSTEM_ERR				=-306;
	static final int ERR_CC_SERVER_ERR				=-307;
	static final int ERR_CC_VERSION_ERROR			=-308;
	static final int ERR_CC_READ_FILE				=-309;
	
}
