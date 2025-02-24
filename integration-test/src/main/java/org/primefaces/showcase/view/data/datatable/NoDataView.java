/*
 * Copyright 2009-2014 PrimeTek.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.primefaces.showcase.view.data.datatable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.primefaces.component.export.ExporterOptions;
import org.primefaces.showcase.view.data.ExCellaExporterOptionsImpl;
import org.primefaces.showcase.view.data.datatable.BasicView.DataTypeCheck;


@Named("dtNoDataView")
@ViewScoped
public class NoDataView implements Serializable {

    public List<DataTypeCheck> getDataTypes() {
        return dataTypes;
    }

    public void setDataTypes(List<DataTypeCheck> dataTypes) {
        this.dataTypes = dataTypes;
    }

    private List<DataTypeCheck> dataTypes = new ArrayList<>();

    public ExporterOptions getExceptionOptions() {
        var options = new ExCellaExporterOptionsImpl();
        options.setThrowExceptionWhenNoData(true);
        return options;
    }
}
