package ch.uzh.ifi.feedback.library.rest.validation;

import ch.uzh.ifi.feedback.library.rest.Service.IDbItem;

public interface IValidator<T extends IDbItem<T>> {
	
	ValidationResult Validate(T object) throws ValidationException, Exception;
	default T Merge(T object) throws Exception { return null; };
	
}