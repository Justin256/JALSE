package jalse.listeners;

import jalse.attributes.Attribute;

/**
 * An abstract adapter for {@link AttributeListener}. This is a convenience
 * class for creating attribute listeners that may not require a full
 * implementation. All methods implemented by this class are empty.
 *
 * @author Elliot Ford
 * @param <T>
 *            Attribute type to trigger for.
 *
 */
public abstract class AttributeAdapter<T extends Attribute> implements AttributeListener<T> {

    @Override
    public void attributeAdded(final T attr) {

    }

    @Override
    public void attributeChanged(final T attr) {

    }

    @Override
    public void attributeRemoved(final T attr) {

    }
}