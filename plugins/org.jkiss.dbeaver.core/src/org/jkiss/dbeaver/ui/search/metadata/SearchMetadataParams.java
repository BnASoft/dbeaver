/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2017 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.search.metadata;

import org.jkiss.dbeaver.model.struct.DBSObject;
import org.jkiss.dbeaver.model.struct.DBSObjectType;

import java.util.List;

/**
 * Search parameters
 */
public class SearchMetadataParams {

    private DBSObject parentObject;
    private List<DBSObjectType> objectTypes;
    private String objectNameMask;
    private boolean caseSensitive;
    private int maxResults;
    private int matchType;

    public SearchMetadataParams()
    {
    }

    public DBSObject getParentObject()
    {
        return parentObject;
    }

    public void setParentObject(DBSObject parentObject)
    {
        this.parentObject = parentObject;
    }

    public List<DBSObjectType> getObjectTypes()
    {
        return objectTypes;
    }

    public void setObjectTypes(List<DBSObjectType> objectTypes)
    {
        this.objectTypes = objectTypes;
    }

    public String getObjectNameMask()
    {
        return objectNameMask;
    }

    public void setObjectNameMask(String objectNameMask)
    {
        this.objectNameMask = objectNameMask;
    }

    public boolean isCaseSensitive()
    {
        return caseSensitive;
    }

    public void setCaseSensitive(boolean caseSensitive)
    {
        this.caseSensitive = caseSensitive;
    }

    public int getMaxResults()
    {
        return maxResults;
    }

    public void setMaxResults(int maxResults)
    {
        this.maxResults = maxResults;
    }

    public int getMatchType()
    {
        return matchType;
    }

    public void setMatchType(int matchType)
    {
        this.matchType = matchType;
    }
}
