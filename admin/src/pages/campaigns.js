import React from 'react';
import { List, Datagrid, DateField, TextField, TextInput, BooleanField, EditButton, DisabledInput, SimpleForm, Edit, BooleanInput, ReferenceField,
  ReferenceArrayInput, SelectArrayInput} from 'react-admin';

export const CampaignList = (props) => (
    <List {...props}>
      <Datagrid>
        <TextField source="id" />
        <ReferenceField label="Creator" source="creator" reference="users">
          <TextField source="username" />
        </ReferenceField>
        <TextField source="name" />
        <DateField source="lastAccessed" />
        <BooleanField source="archived" />
        <EditButton basePath="/campaigns" />
      </Datagrid>
    </List>
);

const CampaignTitle = ({ record }) => {
  return <span>Campaign {record ? `"${record.name}"` : ''}</span>;
};

export const CampaignEdit = (props) => (
    <Edit title={<CampaignTitle />} {...props}>
      <SimpleForm>
        <DisabledInput source="id" />
        <DisabledInput source="lastAccessed" />
        <TextInput label="Name" source="name" />
        <ReferenceArrayInput label="Players" source="playerIds" reference="users">
          <SelectArrayInput optionText="username" />
        </ReferenceArrayInput>
        <BooleanInput source="archived" />
      </SimpleForm>
    </Edit>
);