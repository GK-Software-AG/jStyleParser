package cz.vutbr.web.css;

import java.net.URL;

/**
 * Interface for resolving base and style sheet (href) urls.
 */
public interface CSSURLResolver {

    /**
     * Resolve base url.
     *
     * @param base the base
     * @return the url
     */
    URL resolveBaseURL(String base);

    /**
     * Resolve style sheet url.
     *
     * @param base the base
     * @param href the href
     * @return the url
     */
    URL resolveStyleSheetURL(String base, String href);

}
