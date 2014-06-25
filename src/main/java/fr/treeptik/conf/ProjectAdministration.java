package fr.treeptik.conf;

import org.lightadmin.api.config.AdministrationConfiguration;
import org.lightadmin.api.config.builder.EntityMetadataConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.FieldSetConfigurationUnitBuilder;
import org.lightadmin.api.config.builder.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.api.config.unit.EntityMetadataConfigurationUnit;
import org.lightadmin.api.config.unit.FieldSetConfigurationUnit;
import org.lightadmin.api.config.unit.ScreenContextConfigurationUnit;

import fr.treeptik.model.Project;

public class ProjectAdministration extends AdministrationConfiguration<Project> {

	public EntityMetadataConfigurationUnit configuration(
			EntityMetadataConfigurationUnitBuilder configurationBuilder) {
		return configurationBuilder.nameField("name").build();
	}

	public ScreenContextConfigurationUnit screenContext(
			ScreenContextConfigurationUnitBuilder screenContextBuilder) {
		return screenContextBuilder.screenName("Users Administration").build();
	}

	public FieldSetConfigurationUnit listView(
			final FieldSetConfigurationUnitBuilder fragmentBuilder) {
		return fragmentBuilder.field("user").caption("Utilisateurs")
				.field("name").caption("nom").build();
	}

}
