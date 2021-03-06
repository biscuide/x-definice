package org.xdef.sys;

/** Extension of SUnsupportedOperationException implementing SThrowable
 * interface.
 * @author Vaclav Trojan
 */
public class SUnsupportedOperationException
	extends UnsupportedOperationException implements SThrowable {

	/** Cause of exception. */
	private Throwable _cause;
	/** Report identifier (may be null). */
	private String _msgID;
	/** Report text (may be null). */
	private String _text;
	/** Report modification (may be null). */
	private String _modification;

	/** Creates a new instance of <code>SUnsupportedOperationException</code>
	 * without detail message.
	 */
	public SUnsupportedOperationException() {this("");}

	/** Constructs an instance of <code>SUnsupportedOperationException</code>
	 * with the specified detail message.
	 * @param msg the detail message.
	 */
	public SUnsupportedOperationException(String msg) {this(null, msg);}

	/** Constructs a new exception with the specified cause and a detail
	 * message of (cause==null ? null : cause.toString()) (which typically
	 * contains the class and detail message of cause). This constructor is
	 * useful for exceptions that are little more than wrappers for other
	 * throwables (for example, PrivilegedActionException).
	 * with the specified detail message.
	 * @param cause the cause (which is saved for later retrieval by the
	 * Throwable.getCause() method). (A null value is permitted, and indicates
	 * that the cause is nonexistent or unknown.)
	 */
	public SUnsupportedOperationException(Throwable cause) {
		this(null, cause == null ? "" : cause.getMessage(), cause);
	}

	/** Constructs a new exception with the specified detail message and cause.
	 * @param msg the detail message.
	 * @param cause - the cause (which is saved for later retrieval by the
	 * Throwable.getCause() method). (A null value is permitted, and indicates
	 * that the cause is nonexistent or unknown.)
	 */
	public SUnsupportedOperationException(String msg, Throwable cause) {
		this(null, msg, cause);
	}

	/** Creates a new instance of SUnsupportedOperationException.
	 * @param id The message ID
	 * @param msg The text of message.
	 * @param mod The modification parameters.
	 * @param ex The object which caused the error.
	 */
	public SUnsupportedOperationException(final String id,
		final String msg,
		final Throwable ex,
		final Object... mod) {
		this(id, msg, mod);
		_cause = ex;
	}

	/** Creates a new instance of SUnsupportedOperationException.
	 * @param id The message ID
	 * @param msg The text of message.
	 * @param mod The modification parameters.
	 */
	public SUnsupportedOperationException(final String id,
		final String msg,
		final Object... mod) {
		super(SException.getMsg(id, msg, mod));
		_msgID = id;
		_text = msg;
		_modification = Report.genModification(mod);
	}

	/** Creates a new instance of SUnsupportedOperationException with
	 * registered message.
	 * @param registeredID registered message ID.
	 * @param mod The modification parameters.
	 */
	public SUnsupportedOperationException(final long registeredID,
		final Object... mod) {
		this(Report.error(registeredID, mod));
	}

	/** Creates a new instance of SUnsupportedOperationException.
	 * @param report The Report object.
	 */
	public SUnsupportedOperationException(final Report report) {
		super(SException.getMsg(report));
		_msgID = report.getMsgID();
		_text = report.getText();
		_modification = report.getModification();
	}

	/** Creates a new instance of SUnsupportedOperationException.
	 * @param report The Report object.
	 * @param ex The object which caused the error.
	 */
	public SUnsupportedOperationException(final Report report, Throwable ex) {
		this(report);
		_cause = ex;
	}

	@Override
	/** Set cause of exception.
	 * @param cause The object with cause data.
	 */
	public void setCause(final Throwable cause) {
		_cause = cause;
	}

	@Override
	/** Get cause of exception. If cause was not set return <tt>null</tt>.
	 * @return cause The object with cause data.
	 */
	public Throwable getCause() {
		return _cause;
	}

	@Override
	/** Get Report object associated with this exception.
	 * @return The Report object.
	 */
	public Report getReport() {
		return Report.error(_msgID, _text, _modification);
	}

	@Override
	/** Get id of message.
	 * @return The message id (may be <tt>null</tt>).
	 */
	public String getMsgID() {
		return _msgID;
	}

	@Override
	/** Creates a message text from this exception.
	 * @return The text of localized message.
	 */
	public String getMessage() {
		if (_msgID == null) {
			return Report.text(null, _text, _modification).toString();
		}
		return getReport().toString();
	}

	@Override
	/** Creates a localized message assigned to this exception.
	 * @return The text of localized message.
	 */
	public String getLocalizedMessage() {
		if (_msgID == null) {
			return Report.text(null, _text, _modification).toString();
		}
		return getReport().toString();
	}
}