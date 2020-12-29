<?php

// This file is auto-generated, don't edit it. Thanks.
namespace AntChain\DEMO\Models;

use AlibabaCloud\Tea\Model;

use AntChain\DEMO\Models\DemoClass;

class StatusDemoGatewayCheckRequest extends Model {
    protected $_name = [
        'authToken' => 'auth_token',
        'productInstanceId' => 'product_instance_id',
        'regionName' => 'region_name',
        'aaaa' => 'aaaa',
        'same' => 'same',
    ];
    public function validate() {}
    public function toMap() {
        $res = [];
        if (null !== $this->authToken) {
            $res['auth_token'] = $this->authToken;
        }
        if (null !== $this->productInstanceId) {
            $res['product_instance_id'] = $this->productInstanceId;
        }
        if (null !== $this->regionName) {
            $res['region_name'] = $this->regionName;
        }
        if (null !== $this->aaaa) {
            $res['aaaa'] = $this->aaaa;
        }
        if (null !== $this->same) {
            $res['same'] = [];
            if(null !== $this->same && is_array($this->same)){
                $n = 0;
                foreach($this->same as $item){
                    $res['same'][$n++] = null !== $item ? $item->toMap() : $item;
                }
            }
        }
        return $res;
    }
    /**
     * @param array $map
     * @return StatusDemoGatewayCheckRequest
     */
    public static function fromMap($map = []) {
        $model = new self();
        if(isset($map['auth_token'])){
            $model->authToken = $map['auth_token'];
        }
        if(isset($map['product_instance_id'])){
            $model->productInstanceId = $map['product_instance_id'];
        }
        if(isset($map['region_name'])){
            $model->regionName = $map['region_name'];
        }
        if(isset($map['aaaa'])){
            $model->aaaa = $map['aaaa'];
        }
        if(isset($map['same'])){
            if(!empty($map['same'])){
                $model->same = [];
                $n = 0;
                foreach($map['same'] as $item) {
                    $model->same[$n++] = null !== $item ? DemoClass::fromMap($item) : $item;
                }
            }
        }
        return $model;
    }
    /**
     * @var string
     */
    public $authToken;

    /**
     * @var string
     */
    public $productInstanceId;

    /**
     * @var string
     */
    public $regionName;

    // ffff
    /**
     * @var int
     */
    public $aaaa;

    // ddddd
    /**
     * @var DemoClass[]
     */
    public $same;

}
