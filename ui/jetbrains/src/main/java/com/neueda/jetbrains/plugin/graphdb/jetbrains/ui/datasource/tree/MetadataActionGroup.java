package com.neueda.jetbrains.plugin.graphdb.jetbrains.ui.datasource.tree;

import com.intellij.openapi.actionSystem.ActionGroup;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.neueda.jetbrains.plugin.graphdb.platform.GraphIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MetadataActionGroup extends ActionGroup {

    private final String label;
    private final String dataSourceUuid;

    public MetadataActionGroup(String label, String dataSourceUuid){
        this.label = label;
        this.dataSourceUuid = dataSourceUuid;
    }

    @NotNull
    @Override
    public AnAction[] getChildren(@Nullable AnActionEvent e) {
        return new AnAction[]{new MetadataLabelAction(label, dataSourceUuid, "Query this label", "", GraphIcons.Database.NEO4J)};
    }

}
