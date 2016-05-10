package tech.ghp.web.test;

import org.junit.Assert;
import org.junit.Test;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

import tech.ghp.web.api.Web;

/**
 * 
 */

public class WebTest {

    private final BundleContext context = FrameworkUtil.getBundle(this.getClass()).getBundleContext();
    
    /*
     * 
     */
    @Test
    public void testWeb() throws Exception {
    	Assert.assertNotNull(context);
    	Assert.assertNotNull(getService(Web.class));
    }
    
    @Test
    public void testText() throws Exception {
        Assert.assertEquals( new String("POPOVICI"), getService(Web.class).upper("Popovici"));
    }
    
    <T> T getService(Class<T> clazz) throws InterruptedException {
        ServiceTracker<T,T> st = new ServiceTracker<>(context, clazz, null);
        st.open();
        return st.waitForService(1000);
    }
}
