package de.dreamlab.dash.keywords;

import com.sun.istack.Nullable;
import de.dreamlab.dash.LookupInfoDictionary;

public interface IKeyword {
    @Nullable
    public String getName(final LookupInfoDictionary dict);
}
